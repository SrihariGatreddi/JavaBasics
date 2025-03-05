package OOPS.ExcerciseQuestions;

class invoice {
    String ParNUmber;
    String PArDescription;
    int Quntity;
    double price;
    public invoice(String ParNumber,String PArDescription,int Quantity,double price){
        this.ParNUmber=ParNumber;
        this.PArDescription=PArDescription;
        if (Quntity>0)
            this.Quntity=Quantity;
        else
            this.Quntity=0;
        this.price=price;
    }
    public double getInvoiceAmount(){
        return this.price*this.Quntity;
    }
}
class invoiceTest{
        public static void main(String[] args) {
            invoice in1=new invoice("Book","rabindraNath Tagore",1,20);

        }
}
