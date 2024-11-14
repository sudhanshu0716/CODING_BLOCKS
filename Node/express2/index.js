// const express = require('express');
// const app = express();
// const path=require('path')

// app.set('view engine', 'ejs');
// app.set('views',path.join(__dirname,'views'))
// app.use(express.static(path.join(__dirname,'public')));


// // app.get('/',(req,res)=>{
// //     let rn=Math.floor(Math.random()*10);
// //         res.render('home',{rn})
// //     })

// // app.get('/second',(req,res)=>{
// //     res.render('second')
// // })

// // app.get('/search',(req,res)=>{
// //     res.render('form')
// // })

// // app.get('/ans',(req,res)=>{
// //     let {rest,dish}=req.query;
// //     res.send({rest,dish})
// // })



// app.listen(8000,()=>{
//     console.log("connected")
// })
const express = require('express');
const app = express();
const path = require('path');
const bodyParser = require('body-parser');

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));
app.use(express.static(path.join(__dirname, 'public')));
app.use(bodyParser.urlencoded({ extended: true }));

// In-memory data store for dishes
let dishes = [
  { id: 1, name: 'Pizza', restaurant: 'Italian Bistro' },
  { id: 2, name: 'Sushi', restaurant: 'Sushi World' }
];

// CRUD Routes:

// Read all dishes
app.get('/', (req, res) => {
  res.render('home', { dishes });
});

// Create a new dish
app.get('/dishes/new', (req, res) => {
  res.render('newDish');
});
app.post('/dishes', (req, res) => {
  const { name, restaurant } = req.body;
  dishes.push({ id: dishes.length + 1, name, restaurant });
  res.redirect('/');
});

// Edit a dish
app.get('/dishes/edit/:id', (req, res) => {
  const dish = dishes.find(d => d.id == req.params.id);
  res.render('editDish', { dish });
});
app.post('/dishes/edit/:id', (req, res) => {
  const { name, restaurant } = req.body;
  const dish = dishes.find(d => d.id == req.params.id);
  dish.name = name;
  dish.restaurant = restaurant;
  res.redirect('/');
});

// Delete a dish
app.post('/dishes/delete/:id', (req, res) => {
  dishes = dishes.filter(d => d.id != req.params.id);
  res.redirect('/');
});

// Start server
app.listen(8050, () => console.log("Server running on http://localhost:8050"));
