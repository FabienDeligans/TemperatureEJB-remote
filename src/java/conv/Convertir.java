/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conv;

import javax.ejb.Stateless;

/**
 *
 * @author Admin
 */
@Stateless
public class Convertir implements ConvertirRemote {

    @Override
    public double convertirCelciusToFahrenheit(double t) {
        double fa; 
        fa = 9.0 / 5.0 * t +32; 
        return fa; 
    }

    @Override
    public double convertirFahrenheitToCelcius(double t) {
        double ce; 
        ce = (t-32) * 5.0 / 9.0; 
        return ce; 
    }

    
}
