class Employee
{
  id: number;
  name: string;
  dept:string;
  designation : string;
  
  display(): void
  {
     console.log ("ID: " + this.id + "    Name : "+this.name + "    Dept : "+ this.dept + "    Designation : "+this.designation);
  } }
class regular_employee extends Employee
{
   salary : number;
   
   constructor (id:number, name : string, dept: string, designation : string, salary: number)
   {  
     super();   
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.designation = designation;
	this.salary = salary;
   }
   
   display(): void
   {
      super.display();
	  console.log ("Salary : " + this.salary);
   }
}
class contract_employee extends Employee
{
    salary: number;
    constructor (id:number, name : string, dept: string, designation : string, salary: number,hours: number)
   {  
     super();   
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.designation = designation;
	this.salary=salary
   }
   sal():void{
       this.salary=1000*this.salary;
   }
   display(): void
   {
      super.display();
	  console.log ("Salary : " + this.salary);
   }

}

var regular_employeeObj = new regular_employee(101, "Charan", "IT" , "Project Manager", 500000);

regular_employeeObj.display();
var contract_employeeobj =new contract_employee(104,"Mahesh","IT","Developer",100,80);
contract_employeeobj.sal();
contract_employeeobj.display();