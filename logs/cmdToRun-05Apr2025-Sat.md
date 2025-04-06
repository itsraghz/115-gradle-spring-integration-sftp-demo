# Command to Run and Test

## Commands 

* `curl -X GET "http://localhost:8080/sftp/test"`
* `curl -X POST "http://localhost:8080/sftp/upload?fileName=test.txt&content=Hello%20SFTP\!"`
* `curl -X GET "http://localhost:8080/sftp/list"`

## CURL - GET - `/test`
```
raghavan.muthu@Raghavans-MacBook-Pro SFTP_Exchange % curl -X GET "http://localhost:8080/sftp/test"
Controller is working!%                                                                                                               
```

## CURL - POST - `/upload`
```
raghavan.muthu@Raghavans-MacBook-Pro SFTP_Exchange % curl -X POST "http://localhost:8080/sftp/upload?fileName=test.txt&content=Hello%20SFTP\!"
{"success":true,"message":"File uploaded successfully","filename":"test.txt"}%                  
```
## CURL - GET - `/list`
```
raghavan.muthu@Raghavans-MacBook-Pro SFTP_Exchange % curl -X GET "http://localhost:8080/sftp/list"
[".","..","04Apr2025-Fri-SSH-Upload-NNTO.txt","04Apr2025-Fri-SFTP-Response-NNTO.txt","test.txt"]%                                     raghavan.muthu@Raghavans-MacBook-Pro SFTP_Exchange % 
```