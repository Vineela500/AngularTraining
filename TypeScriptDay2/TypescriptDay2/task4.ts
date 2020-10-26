var count:number=0;
var flag:number=0;
console.log(2);
for(var i:number=3;count<10;i++){
    for(var j:number =2; j<i;j++){
        if(i%j==0){
           flag=1;
        }
        
    }
    if(flag==0){
        console.log(i);
        count++;
    }
    flag=0;
}