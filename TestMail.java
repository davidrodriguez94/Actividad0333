/**
 * 
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TestMail
{
  
  public static void main(String[] args)
  {
        MailServer mServer = new MailServer();
        MailClient mClient = new MailClient(mServer,"usuario");
        
        MailItem mItem1 = MailItem(true,"desde", "para", "asunto", "ola k ase");
        MailItem mItem2 = MailItem(false,"desde", "para", "asunto", "compila o k ase");
        
        //prueba de impresion de un item
        mItem1.print();
        
        //prueba envio de email
        mClient.sendMailItem("para","asunto","mensaje");
        mClient.sendMailItemEncriptado("para","asunto","mensaje");
        
        MailItem cipote = new MailItem(true, "Ana", "Antonio", "Que tal", "Hola, que tal?");
       	//prueba imprimir siguiente mail
       	printNextMailItem();
        
  }

}
*/