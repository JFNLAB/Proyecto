/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.sourceforge.jbarcodebean.BarcodeException;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.*;

/**
 *
 * @author julian
 */
public class Barras {

    public void CreateBarcode(String codigo, String nombre, String apellido) throws IOException {

        JBarcodeBean barcode = new JBarcodeBean();

        // nuestro tipo de codigo de barra
        barcode.setCodeType(new Code128());
        //barcode.setCodeType(new Code39());

        // nuestro valor a codificar y algunas configuraciones mas
        barcode.setCode(codigo);
        barcode.setCheckDigit(true);

        BufferedImage bufferedImage = barcode.draw(new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB));

        // guardar en disco como png
        File file = new File(nombre+"_"+apellido+".png");
        try {
            ImageIO.write(bufferedImage, "png", file);
        } catch (IOException e){
            throw e;
        }
    }

}

