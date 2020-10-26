var data:number|string;
data=20;
data="momp";
var flag:number=0;
for(var i:number=0;i<=data.length/2;i++){
    if(data[i]!=data[data.length-i-1]){
       
       flag=1;
    }
}
if(flag==0){
    console.log("Palindrome");
}
else{
    console.log("Not a palindrome");
}
if(typeof data=="string"){
    console.log("String");
}
data=30;
if(typeof data=="number"){
    console.log("Number");
}