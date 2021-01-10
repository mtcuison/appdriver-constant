/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.rmj.appdriver.constants;

/**
 *
 * @author kalyptus
 */
public class GCardStatus {
    public static final String NEW = "0";             // status pag-kaverify ng gcard application...
    public static final String PRINTED = "1";         // pagka-received ng mga GCard na naprint-han na ng GCard Number
    public static final String ENCODED = "2";         // nalagyan ng data 
    public static final String ISSUED = "3";          // pag ibinigay sa customer itatag ng branch as issued
    public static final String ACTIVATED = "4";       // to confirmed na nasa customer na ang card at ready for use
    public static final String SUSPENDED = "5";       // pag-naimpound
    public static final String REPLACED = "6";        // (walang bayad - guanzon ang may problem) pag nag-entry ng replacement ng gcard at naverify na yung bagong application
    public static final String RENEWED = "7";         // (may bayad) pag nag-apply for renewal ng gcard at naverify na yung bagong application
    public static final String UNKNOWN = "X";
}

