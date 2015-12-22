package test

import grails.rest.Resource


//@Resource(uri='/books')
class Book {
    

    String title
    String author
    Double price
    
    static mapping = {
        table name: "LIBRO"
        version false
        colummns  {
            title column : "TITULO"
            author column: "AUTOR"
            price column: "PRECIO"
        }
    }

    static constraints = {
        title blank:false 
        author blank:false   
    }
}
