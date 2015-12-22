package test

import grails.rest.Resource


//@Resource(uri='/books')
class Book {
    

    String title
    Author author
    Double price
    
    static belongsTo = [author: Author]
    
    static mapping = {
        table name: 'LIBRO'
        version false
        id column: 'ID' 
        id generator:'native', params:[sequence:'LIBRO_SEQ']
        title column : 'TITULO', type: String
        author column: 'ID_AUTOR'
        price column: 'PRECIO', type: Double

    }

    static constraints = {
        title blank:false 
        author blank:false   
    }
}
