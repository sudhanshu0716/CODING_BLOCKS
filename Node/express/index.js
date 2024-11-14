const express=require('express');
const app=express();

app.use((req,res,next)=>{
    console.log("mai hu middleware")
    // console.log(req)
    // res.send('<h1>response</h1>')
    next();
})

app.get('/',(req,res)=>{
    res.send("<h1>root route</h1>")
})
app.listen(8080,()=>{
    console.log("connected")
})