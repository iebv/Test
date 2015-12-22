
import test.Book
import test.Author

class BootStrap {

    def init = { servletContext ->
         
        def a1 = new Author(name:"Gavin", lastName: "King").save()
        def a2 = new Author(name:"Matt", lastName: "Raible").save()
        new Book(title:"Java Persistence with Hibernate", author: a1, price:99.00).save()
        new Book(title:"Spring Live", author: a2, price:29.00).save()
    }   
    def destroy = {
    }
}
