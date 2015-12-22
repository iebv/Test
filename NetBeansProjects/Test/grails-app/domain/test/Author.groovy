package test

class Author {
    
    String name
    String lastName
    
    
    
    static mapping = {
        table name: 'AUTOR'
        version false
        id column: 'ID' 
        id generator:'native', params:[sequence:'AUTOR_SEQ']
        name column : 'NOMBRE', type: String
        lastName column: 'APELLIDO', type: String
    }

    
}
