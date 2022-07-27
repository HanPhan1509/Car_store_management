/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom10_qlx;

/**
 *
 * @author admin
 */
public class MyException extends Exception{
    public MyException(){
    
    }
    public MyException(String msg){
        super(msg);
    }
       public MyException(String msg,Throwable cause){
        super(msg,cause);
    }
}
