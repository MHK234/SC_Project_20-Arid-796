package sc_project;

abstract class person {
    private  String name;
    private String address;
    private double CNIC;
     String getName(){
         return name;
     }
     void setName(String name){
         this.name=name;
     }
     String getAddress(){
         return address;
     }
     void setAddress(String address){
         this.address=address;
     }
     double getCNIC(){
         return CNIC;
     }
     void setCNIC(double CNIC){
         this.CNIC=CNIC;
     }
}
