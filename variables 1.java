//here is how strings can be tied to variables and be called using methods.
class Demo {
    public static void main(String[] args) {
        //string example
        String city; //String needs to be capital, also the second word is the variable we are calling for a string.
        //the value of city is now New York City so when we call for the string city we will get NYC
        city = "New York City"; // we have to still put semicolons at the end for syntax
        //now we can print the value of city like this
        System.out.print(city);
    }
}
//output: "New York City"

//here we show that you can combine the declaration and assignment into one statement

class Demo {
    public static void main(String[] args){
        String name = "This is the new (AIO) statement!";

        System.out.println(name);
     }
}
//output: "This is the new (AIO) statement!"