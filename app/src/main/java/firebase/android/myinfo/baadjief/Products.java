package firebase.android.myinfo.baadjief;

/**
 * Created by Baadjie on 2017/10/03.
 */

public class Products {

    private String custName;
    private String cardNo;
    private String cellno;
    private String email;
    private double total;
    private  String orderMessage;
    private String time;

    public Products() {
    }

    public Products(String custName, String cardNo, String cellno, String email, double total, String orderMessage,String time) {
        this.custName = custName;
        this.cardNo = cardNo;
        this.cellno = cellno;
        this.email = email;
        this.total = total;
        this.time=time;
        this.orderMessage = orderMessage;
    }
    private String getTime(){


        return  time;
    }
    public void setTime(String time){


        this.time=time;
    }
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCellno() {
        return cellno;
    }

    public void setCellno(String cellno) {
        this.cellno = cellno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }
}
