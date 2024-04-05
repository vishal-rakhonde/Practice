import java.util.*;
 public class DateTimeQuestion{
	 private int day;
	 private int month;
	 private int year;
	 private int sec;
	 private int hour;
	 private int min;
	 private static SimpleDateFormat sdf=new SimpleDateFormat();
	 private Date inputDate;
	 Scanner sc=new Scanner(System.in);
	 
	 public void setInputDate(){
		 this.inputDate=new Date(getYear()-1900,getMonth()-1,getDay(),getHour(),getMin(),getSec());
	 }
	 public int getDay(){
		 return day;
	 }
	 public void setDay(int day){
		 this.day=day;
	 }
	 public int getMonth(){
		 return month;
	 }
	 public void setMonth(int month){
		 this.month=month;
	 }
	 public int getYear(){
		 return year;
	 }
	 public void setYear(int year){
		 this.year=year;
	 }
	 public int getHour(){
		 return hour;
	 }
	 public void setHour(int hour){
		 this.hour=hour;
	 }
	 public int getMin(){
		 return min;
	 }
	 public void setMin(int min){
		 this.min=min;
	 }
	 public int getSec(){
		 return sec;
	 }
	 public void setSec(int sec){
		 this.sec=sec;
	 }
	 
		String getFormattedDate(String inputFormat) {
		sdf = new SimpleDateFormat(inputFormat);
		return sdf.format(this.inputDate);
		}
	 
	 void addDate(){
		 System.out.println("Enter date and time");
		 System.out.print("day- ");
		 setDay(sc.nextInt());
		 System.out.print("month- ");
		 setMonth(sc.nextInt());
		 System.out.print("year - ");
		 setYear(sc.nextInt());
		 System.out.print("hour- ");
		 setHour(sc.nextInt());
		 System.out.print("minute- ");
		 setMin(sc.nextInt());
		 System.out.print("seconds- ");
		 setSec(sc.nextInt());
		 setInputDate();
	 }
	 int getMenuChoice(){
		 System.out.println("Change date format");
		 System.out.println("1. dd/mm/yyyy");
		 System.out.println("2. mm/dd/yyyy");
		 System.out.println("3. yyyy/mm/dd");
		 System.out.println("4. hh:mm:ss");
		 System.out.println("5. hh:mm:ss a ");
		 System.out.println("6. hh.mm");
		 System.out.println("7. dd/mm/yyyy hh:mm:ss");
		 System.out.println("8. mm/dd/yyyy hh.mm.ss a");
		 System.out.println("9. yyyy/mm/dd hh.mm");
		 return sc.nextInt();
	 }
	 
	 void printInDifferentFormat(){
		 int choice;
		 
		 while((choice=getMenuChoice()) !=0){
			 switch (choice){
				 default :
				 System.out.println("Enter valid choice");
				 
				 case 1:
				 System.out.println("\nFormatted date- "+getFormattedDate("dd/mm/yyyy"));
				 break;
				 case 2:
				 System.out.println("\nFormatted date- "+getFormattedDate("mm/dd/yyyy"));
				 break;
				 case 3:
				 System.out.println("\nFormatted date- "+getFormattedDate("yyyy/mm/dd"));
				 break;
				 case 4:
				 System.out.println("\nFormatted date- "+getFormattedDate("hh:mm:ss"));
				 break;
				 case 5:
				 System.out.println("\nFormatted date- "+getFormattedDate("hh:mm:ss a"));
				 break;
				 case 6:
				 System.out.println("\nFormatted date- "+getFormattedDate("hh:mm"));
				 break;
				 case 7:
				 System.out.println("\nFormatted date- "+getFormattedDate("dd/mm/yyyy hh:mm:ss "));
				 break;
				 case 8:
				 System.out.println("\nFormatted date- "+getFormattedDate("mm/dd/yyyy hh:mm:ss a"));
				 break;
				 case 9:
				 System.out.println("\nFormatted date- "+getFormattedDate("yyyy/mm/dd hh:mm"));
				 break;
			 }
		 }
	 }
 
				 
	 
	 public static void main(String[] args){
		 DateTimeQuestion dt=new DateTimeQuestion();
		 dt.addDate();
		 dt.printInDifferentFormat();
	 }
 }
	