public class PayrollCalc {
   
	
    private String name;
    private String surname;
    private String address;
    private String employeeid;
    private String birthday;
    private String phonenumber;
    private String sssno;
    private String philhealthno;
    private String tinno;
    private String pagibigno;
    private String immediatesupervisor;
    private String status;
    private String position;
    private double hoursWorked;
    private double hourlyPayRate;
    private double dailyhoursworked;
    private double dailypayrate;
    public double ssstax;
    
   
    
    
    
   
 
    public PayrollCalc()
    {
 
    }
 
    public PayrollCalc(String n, String s, String a, String e, String b, String pn, String sn, String ph, String ti, String pi, String st, String po, String is, double hw, double hpr, double dw, double dpr, double sss) {
    this.name = n;
    this.surname = s;
    this.address = a;
    this.employeeid = e;
    this.birthday = b;
    this.phonenumber = pn;
    this.sssno = sn;
    this.philhealthno = ph;
    this.tinno = ti;
    this.pagibigno = pi;
    this.status = st;
    this.position = po;
    this.immediatesupervisor = is;
    this.hoursWorked = hw;
    this.hourlyPayRate = hpr;
    this.dailyhoursworked = dw;
    this.dailypayrate = dpr; 
}

        
        
     
 public double grossPay(double hourlyRate, double hrsWorked)
 {
        double grossPay = (hourlyRate * hrsWorked);
        return grossPay;
 }
 
 public double grosspay(double dailyworked, double dailyhourworked)
 {
    	double grossPay = (dailypayrate * dailyhoursworked );
    	return grossPay;
    	
 }
      double grosspay;
 public double philhealth(double grosspay)
 {				    	
        double philhealth = grosspay * 0.015;  
			
		{
			 if (grosspay<= 10000){
	                philhealth = grosspay * 0.015;
	            } else if (grosspay >= 10001 && grosspay == 59999){
	                philhealth = grosspay * 0.015;
	            } else if (grosspay >= 60000) {
	            	philhealth = grosspay * 0.015;
	            }
                }
		      return philhealth;
 }	
		
  public double pagibig(double grosspay)
{                                  
        double pagibig = 0.0;
                        
        {
             if (grosspay<= 1500){
                pagibig = grosspay * 0.01;
            } else if (grosspay > 1500){
                pagibig = 100;    
            
            
          }    
          }
        return pagibig;
        }

  public double sss(double grosspay)
{
	double sss = 0;			
		{
		if (grosspay < 3250) {
                     sss = 135;
                 } else if (grosspay <= 3750 && grosspay > 3250) {
                     sss = 157.50;
                 } else if (grosspay <= 4250 && grosspay > 3750) {
                     sss = 180.00;
                 } else if (grosspay <= 4750 && grosspay > 4250) {
                     sss = 202.50;
                 } else if (grosspay <= 5250 && grosspay > 4750) {
                     sss = 225.00;
                 } else if (grosspay <= 5750 && grosspay > 5250) {
                     sss = 247.50;
                 } else if (grosspay <= 6250 && grosspay > 5750) {
                     sss = 270.00;
                 } else if (grosspay <= 6750 && grosspay > 6250) {
                     sss = 292.50;
                 } else if (grosspay <= 7250 && grosspay > 6750) {
                     sss = 315.00;
                 } else if (grosspay <= 7750 && grosspay > 7250) {
                     sss = 337.50;
                 } else if (grosspay <= 8250 && grosspay > 7750) {
                     sss = 360.00;
                 } else if (grosspay <= 8750 && grosspay > 8250) {
                     sss = 382.50;
                 } else if (grosspay <= 9250 && grosspay > 8750) {
                     sss = 405.00;
                 } else if (grosspay <= 9750 && grosspay > 9250) {
                     sss = 427.50;
                 } else if (grosspay <= 10250 && grosspay > 9750) {
                     sss = 450.00;
                 } else if (grosspay <= 10750 && grosspay > 10250) {
                     sss = 472.50;
                 } else if (grosspay <= 11250 && grosspay > 10750) {
                     sss = 495.00;
                 } else if (grosspay <= 11750 && grosspay > 11250) {
                     sss = 517.50;
                 } else if (grosspay <= 12250 && grosspay > 11750) {
                     sss = 540.00;
                 } else if (grosspay <= 12750 && grosspay > 12250) {
                     sss = 562.50;
                 } else if (grosspay <= 13250 && grosspay > 12750) {
                     sss = 585.00;
                 } else if (grosspay <= 13750 && grosspay > 13250) {
                     sss = 607.50;
                 } else if (grosspay <= 14250 && grosspay > 13750) {
                     sss = 630.00;
                 } else if (grosspay <= 14750 && grosspay > 14250) {
                     sss = 652.50;
                 } else if (grosspay <= 15250 && grosspay > 14750) {
                     sss = 675.00;
                 } else if (grosspay <= 15750 && grosspay > 15250) {
                     sss = 697.50;
                 } else if (grosspay <= 16250 && grosspay > 15750) {
                     sss = 720.00;
                 } else if (grosspay <= 16750 && grosspay > 16250) {
                     sss = 742.50;
                 } else if (grosspay <= 17250 && grosspay > 16750) {
                     sss = 765.00;
                 } else if (grosspay <= 17750 && grosspay > 17250) {
                     sss = 787.50;
                 } else if (grosspay <= 18250 && grosspay > 17750) {
                     sss = 810.00;
                 } else if (grosspay <= 18750 && grosspay > 18250) {
                     sss = 832.50;
                 } else if (grosspay <= 19250 && grosspay > 18750) {
                     sss = 855.00;
                 } else if (grosspay <= 19750 && grosspay > 19250) {
                     sss = 877.50;
                 } else if (grosspay <= 20250 && grosspay > 19750) {
                     sss = 900.00;
                 } else if (grosspay <= 20750 && grosspay > 20250) {
                     sss = 922.50;
                 } else if (grosspay <= 21250 && grosspay > 20750) {
                     sss = 945.00;
                 } else if (grosspay <= 21750 && grosspay > 21250) {
                     sss = 967.50;
                 } else if (grosspay <= 22250 && grosspay > 21750) {
                     sss = 990.00;
                 } else if (grosspay <= 22750 && grosspay > 22250) {
                     sss = 1012.50;
                 } else if (grosspay <= 23250 && grosspay > 22750) {
                     sss = 1035.00;
                 } else if (grosspay <= 23750 && grosspay > 23250) {
                     sss = 1057.50;
                 } else if (grosspay <= 24250 && grosspay > 23750) {
                     sss = 1080.00;
                 } else if (grosspay <= 24750 && grosspay > 24250) {
                     sss = 1102.50;
                 } else if (grosspay > 24750) {
                     sss = 1125.00;
        }
	    }             
                    return sss;
}
 public double ricesubsidyallowance(double grosspay)
{
    double ricesubsidyallowance = 0.0;
    
    if (status.equals("Regular")) {
        ricesubsidyallowance = 1500;
    } else if (status.equals("Non-regular")) {
        ricesubsidyallowance = 0;
    }
    
    return ricesubsidyallowance;
}

					
 public static double calculatePhoneAllowance(String position, String status) {
    double phoneAllowance = 0.0;
    
    if (status.equals("Regular")) {
        if (position.equalsIgnoreCase("Manager")) {
            phoneAllowance = 1000;
        } else if (position.equalsIgnoreCase("Team leader")) {
            phoneAllowance = 800;
        } else if (position.equalsIgnoreCase("Rank and file")) {
            phoneAllowance = 500;
        }
    } else if (status.equals("Non-regular")) {
        phoneAllowance = 0;
    }
    
    return phoneAllowance;
}

 
			
public double calculateClothingAllowance(String position, String status) {
    double clothingAllowance = 0.0;
    
    if (status.equalsIgnoreCase("Regular")) {
        if (position.equalsIgnoreCase("Manager")) {
            clothingAllowance = 1000;
        } else if (position.equalsIgnoreCase("Team leader")) {
            clothingAllowance = 800;
        } else if (position.equalsIgnoreCase("Rank and file")) {
            clothingAllowance = 500;
        }
    } else if (status.equalsIgnoreCase("Non-regular")) {
        clothingAllowance = 0;
    }
    
    return clothingAllowance;
}
			


 public double getTax(double grosspay) {
    double tax = 0.0;
    if (grosspay <= 20832) {
        tax = grosspay * 0.0;  
    } else if (grosspay >= 20832 && grosspay < 33333) {
        tax = (grosspay - 20832) * 0.20;
    } else if (grosspay >= 33333 && grosspay < 66667) {
        tax = (grosspay - 33333) * 0.25;
    } else if (grosspay >= 66667 && grosspay < 166667) {
        tax = (grosspay - 66667) * 0.30;
    } else if (grosspay >= 166667 && grosspay < 666667) {
        tax = (grosspay - 166667) * 0.32;
    } else if (grosspay >= 666667) {
        tax = (grosspay - 666667) * 0.35;
    }
    return tax;
}

      
    
    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
    	return surname;
	    
    }
     
    public void setSurname(String surname) {
      this.surname = surname;
      
    }
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address){
      this.address = address;
    }
    
     
    public String getEmployeeID() {
    	return employeeid;
    	
    }
    
    public void setEmployeeID(String employeeid) {
    	this.employeeid = employeeid;		
    }
    

    public String getBirthday() {
    	return birthday;
    	  	
    }	
    
    public void setBirthday(String birthday) {
    	this.birthday = birthday;
    }
    
    public String getPhonenumber() {
    	return phonenumber; 		
    }
    
    public void setPhonenumber(String phonenumber) {
    	this.phonenumber  = phonenumber;
    }
    
    public String getSSSno() {
    	return sssno;	
    }
    
    public void setSSSno(String sssno) {
        this.sssno = sssno;
    }       
    
    public String getPhilhealthno() {
    	return philhealthno;
    }
    
    public void setPhilhealthno(String philhealthno) {
    	this.philhealthno = philhealthno;
    
    }
    public String getTinno() {
    	return tinno;
  
    }
    
    public void setTinno(String tinno) {
		this.tinno = tinno;
    }
    
    public String getPagibigno() {
    	return pagibigno;
	
    }

    public void setPagibigno(String pagibigno) {
	    this.pagibigno = pagibigno;		
	
    }
    
    public String getStatus() {
    	return status;
    	
    }

    public void setStatus(String status) {
         this.status = status;		
    	
    }
    
    
    public String getImmediatesupervisor() {
    	return immediatesupervisor;
    	
    }

    public void setImmediatesupervisor(String immediatesupervisor) {
    this.immediatesupervisor = immediatesupervisor;		
    	
    }
   
    
    public String getPosition() {
    	return position;
    	
    }

    public void setPosition(String position) {
    this.position = position;		
    	
    }
   
   
    public double getHoursWorked() {
        return hoursWorked;
    }
 
 
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
 
 
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
 
 
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
        
    }
    
    public double getDailyhoursworked() {
        return dailyhoursworked;
    }
     
     
    public void setDailyhoursworked(double dailyhoursworked) { 
        this.dailyhoursworked = dailyhoursworked;
    }
     
     
    public double getDailypayrate() {
        return dailypayrate;
            
    }
    
    public void setDailypayrate(double dailypayrate) {
    	this.dailypayrate = dailypayrate;
    }	
    public double getSss() {
        return getSss();	
    	
    }
    }
    





