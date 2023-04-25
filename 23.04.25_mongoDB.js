db.getCollection("memo").find({})
db.memo.find({})
db.memo.find({name: "Tom", office: "seoul"},{phone: 1}).count() //and조건 
db.memo.find({$or : [{name: "Tom"}, {office: "seoul"}]},{phone: 1}).count()
//{$or : [{조건키:값}, {조건키:값}]}

db.memo.find({office:'busan'}, {_id:0, office:1, phone:1}) 
//busan인 것 중에서 id가림,office랑 phone보임


db.memo.find({office:{$not: /busan/}},{_id:0, office:1, phone:1}) 
//busan이 아닌것 중에서 id가림,office랑 phone보임
//not연산자
//.limit(3) : 3개만 가져와라

db.memo.deleteOne({office: 'Wordware'})

db.memo.find({office: 'Wordware'})

db.memo.updateMany({office: 'seoul'}, {$set : {phone : '999'}})

db.memo.find({office: 'seoul'}, {phone:1})

db.memo.deleteMany({})

db.meno.find({}).count()