// object ka parent hai prototye and prototype is named with object prototye and 
// object prototype ka bhi parent hai ek prototype he hai 
// tender proto parent check krne ke kaam ata hai _proto_
// null is the last prototype  of tenderChaining
//obj._proto_==object.prototype

// jab bhi pura object type krte hai toh uska tender proto is object.prototype
// har kisi ka ek tender proto hota hai jaise array or String a String
let ans="madhav";
console.log(ans);
// s._proto_ >> String._proto_ >> Object.prototype >> null 
//if a object is hardcoded then it's tender.proto is object.protoype 
// when it comes to a object made by conustrator then it's
// function Sam(naam,umar,rang){
//     this.name=naam;
//     this.age=age;
//     this.favColor=favRang;
// }
// Sam.prototype.fn=function(){
//     console.log("kaju");
// }
// let p1=new Sam("sam",90,"neela");
// let p2=new Sam("ram",30,"peela");
// console.log(p1,p2);

class Sam{
    constructor (naam,umar,rang){
        this.name=naam;
        this.age=age;
        this.favColor=favRang;
    }
    fn(){
        console.log("kaju");
    }
}
let p1=new Sam("sam",90,"neela");
let p2=new Sam("ram",30,"peela");
console.log(p1,p2);
