public class House {
    String type;
    int area;
    
    public House(){}

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        if (type.length()>=3){
            //Lấy ba kí tự cuối cùng của chuỗi type
            String last3Chars = type.substring(type.length()-3);
            //Đảo ngược 3 ký tự cuối của chuỗi 
            return new StringBuilder(last3Chars).reverse().toString();      
        } else {
            return new StringBuilder(type).reverse().toString();
        }
    }

    public int getArea() {
        return area;
    }

    public void setArea(int newArea) {
        this.area = 3*newArea;
    }
    
    
}
