package org.rmj.appdriver.constants;

public class CRMEvent {
    public static final String CASHIER_LOGIN = "0001";
    public static final String CASHIER_LOGIN_DENIED = "0002";
    public static final String SHIFT_OPENING = "0003"; //open shift
    public static final String SHIFT_CLOSING = "0004"; //close shift
    public static final String ACTION_DENIED = "0005"; //action was denied
    public static final String ACTION_ALLOWED = "0006"; //action was allowed
    public static final String DELETE_ITEM = "0007"; //delete detail
    public static final String MODIFY_ITEM = "0008"; //search item
    public static final String CANCELLED_INVOICE = "0009"; //cancel transaction
    public static final String VOID_ORDER = "0010"; //void transaction
    public static final String MODIFY_DISCOUNT = "0011"; //modify master discount
    public static final String PRINT_INVOICE = "0012"; //print or
    public static final String REPRINT_INVOICE = "0013"; //reprint or
    public static final String PAY_BILL = "0014"; //close transaction; payment
    public static final String NEW_ORDER = "0015"; //new transaction
    public static final String LOAD_ORDER = "0016"; //load transaction
    public static final String LOAD_SHIFT = "0017"; //load shift
    public static final String PRINT_X_READING = "0018"; //x reading
    public static final String PRINT_Y_READING = "0019"; //y reading
    public static final String PRINT_Z_READING = "0020"; //z reading
    public static final String CASH_DEPOSIT = "0021"; //cash deposit; beginning balance
    public static final String CASH_PULLOUT = "0022";
    public static final String SALES_RETURN = "0023";
    public static final String CASHIER_LOGOUT = "0024"; //cashier logout
    public static final String ADD_ITEM = "0025"; //add detail
    public static final String CANCELLED_LOGIN = "0026";
    //2020-04-05
    public static final String CASH_DRAWER_CHECK = "0027"; //open cash drawer
    public static final String DECLARE_NEW_DAY = "0028"; //end of day transaction
    public static final String POST_ORDER = "0029"; //post transaction
    public static final String CLOSE_ORDER = "0030"; //close transaction
    public static final String CANCEL_ORDER = "0031"; //cancel transaction
    public static final String MODIFY_ORDER = "0032"; //update transaction
    public static final String MODIFY_ITEM_DISCOUNT = "0033"; //modify detail discount
    public static final String CLEAR_ORDER = "0034"; //order has been reset
}
