package test

import grails.rest.Resource


//@Resource(uri='/books')
class Book {
    

    String title
    String author
    Double price
    
    static mapping = {
        table name: 'LIBRO'
        version false
        id generator:'native', params:[sequence:'LIBRO_SEQ']
          
            title column : 'TITULO', type: String
            author column: 'AUTOR', type: String
            price column: 'PRECIO', type: Double
        
    }

    static constraints = {
        title blank:false 
        author blank:false   
    }
}
