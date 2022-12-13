package cc.yhscy.constructor;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

/**
 * @author ShiChun
 * @date 2022/12/13 8:57
 */
public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.name);
        System.out.println(c.price);


        Car c2 = new Car("宝马",80);
        System.out.println(c2.name);
        System.out.println(c2.price);



    }


}
