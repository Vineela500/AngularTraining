class Employee1{
id:number;
name:string;
designation:string;
dept:string;
constructor(id: number,name:string,designation:string,dept:string){
    this.id=id;
    this.name=name;
    this.designation=designation;
    this.dept=dept;
}
display():void{
    console.log ("ID: " + this.id + "    Name : "+this.name + "    Dept : "+ this.dept + "    Designation : "+this.designation);
 }
}
var obj=new Employee1(101,"Piyush","IT","Manager");
obj.display();
