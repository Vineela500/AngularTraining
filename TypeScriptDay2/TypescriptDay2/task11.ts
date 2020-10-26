class Student{
    private id:number;
    private name:string;
    private stream:string;
    constructor(id:number,name:string,stream:string){
        this.id=id;
        this.name=name;
        this.stream=stream;
    }
    getId():number{
        return this.id;
    }
    getName():string{
        return this.name;
    }
    getStream():string{
        return this.stream;
    }
}
var objstudent=new Student(101,"Abhay","CSE");
console.log("ID: "+objstudent.getId());

console.log("Name: "+objstudent.getName());

console.log("Stream: "+objstudent.getStream());