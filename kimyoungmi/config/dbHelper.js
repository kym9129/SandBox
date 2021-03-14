const mariadb = require('mysql');
var config = require('./db_config');

const pool = mariadb.createPool({
    host: config.host,
    port: config.port,
    user: config.user,
    password: config.password,
    database: config.database,
    connectionLimit: 5
});

function dbHelper(){
        this.getConnection = function(callback){
            pool.getConnection()
                .then(conn=>{
                    callback(conn);
                }).catch(err =>{
                    //not connected
            });
        };
        
        this.getConnectionAsync = async function(){
            try{
                let conn = await pool.getConnection();
                return conn;
            } catch (err){
                throw err;
            }
            return null;
        };

        this.sendJSON = function(response, httpCode, body){
            var result = JSON.stringify(body);
            response.send(httpCode, result);
        };
}

module.exports = new dbHelper();
