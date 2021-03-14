var dbHelper = require('../../config/dbHelper');

function UserService(){
    this.getUserList = function(request, response){
        dbHelper.getConnection(function(conn){
            conn.query('SELECT * FROM tbl_users')
                .then((results) => {
                    //Outout
                    var output = {};
                    var temp = [];
                    output.datas = results;

                    dbHelper.sendJSON(response, 200, output);
                })
                .then((res) => {
                    console.log('res = ' + res);
                    conn.end();
                })
                .catch(err=>{
                    //handle error
                    console.log(err);
                    conn.end();
                })
        });
    }
}
module.exports = new UserService();
