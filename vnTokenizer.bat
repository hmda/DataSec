@echo off
cd /d %0\..
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
java -Xms512M -jar vn.hus.nlp.tokenizer-4.1.1.jar %*
=======
java -jar vn.hus.nlp.tokenizer-4.1.1.jar %*
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
java -jar vn.hus.nlp.tokenizer-4.1.1.jar %*
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
java -jar vn.hus.nlp.tokenizer-4.1.1.jar %*
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
if NOT "%COMSPEC%" == "%SystemRoot%\system32\cmd.exe" goto end
if %errorlevel% == 9009 echo Java is not in your PATH. Cannot run program.
if errorlevel 1 pause

:end
