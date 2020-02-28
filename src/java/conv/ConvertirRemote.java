/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conv;

import javax.ejb.Remote;

/**
 *
 * @author Admin
 */
@Remote
public interface ConvertirRemote {
    public double convertirCelciusToFahrenheit(double t); 
    public double convertirFahrenheitToCelcius(double t); 
}
