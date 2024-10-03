package Bai16;

public class GiaoDichThu extends GiaoDich {
    
    public GiaoDichThu() {}

    public GiaoDichThu(String maGiaoDich, String ngayGiaoDich, double soTien) {
        super(maGiaoDich, ngayGiaoDich, soTien);
    }
    
    @Override
    public void isValidateTransaction() throws InvalidTransactionException {
    	if (this.soTien < 1000) 
    		throw new InvalidTransactionException("So tien giao dich phai tu 1000 tro len.");
    	
    	super.isValidateTransaction();
        
        // OR
      // Calendar transactionDate = Calendar.getInstance();
        //  transactionDate.set(transactionYear, transactionMonth, transactionDay);
       
        //  Calendar currentDate = Calendar.getInstance();
        
        //  if (transactionDate.after(currentDate)) {
        //      throw new InvalidTransactionException("Ngày giao dịch không hợp lệ.");
        //  }
    }

    @Override
    public String toString() {
        return "Giao dich thu:\n" + super.toString();
    }
}
