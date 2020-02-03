window.addEventListener('load', function(){
              
    //detectar cuando toco el boton de registro (se envía el formulario)
     var botonRegistro = document.getElementById("submit");
     botonRegistro.addEventListener('click',function(){
      
      //tomar los datos del formulario
        
        var email = document.getElementById("email");
        var pass = document.getElementById("password");
        var pass_confirm = document.getElementById("password_confirm")
        var errores = false;
        var expresion = /\w+@\w+\.+[a-z]/;
       

       //los span de errores del formulario 
        
        var errorEmail = document.querySelector("span.errorEmail");
        var errorPass = document.querySelector("span.errorContrasenia");
   
      //por cada dato voy a validar
      
          //campo email
          if(email.value == ""){
            errorEmail.innerHTML = "El correo electrónico es obligatorio.";
            email.style.border = "2px solid #ffa81c";
            errores = true;
          }else if(email.value.length < 3){
            errorEmail.innerHTML = "El correo electrónico debe contener al menos 3 caracteres.";
            email.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(email.value.length > 40){
            errorEmail.innerHTML = "La extensión del correo electrónico no debe superar los 40 caracteres.";
            email.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(email.value.trim()== ""){
            errorEmail.innerHTML = "El correo electrónico no puede tener espacios vacíos.";
            email.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(!expresion.test(email.value)){
            errorEmail.innerHTML = "El formato no es válido.";
            email.style.border = "2px solid #ffa81c";
            errores = true;
        
        
        }else{
            errorEmail.innerHTML = "";
            email.style.border = "2px solid #20db93";
          }
     
        
            //campo password
        if(pass.value == ""){
        errorPass.innerHTML = "La contraseña es obligatoria.";
            pass.style.border = "2px solid #ffa81c";
            errores = true;
            }else if(pass.value.length < 8){
            errorPass.innerHTML = "La contraseña debe contener al menos 8 caracteres.";
            pass.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(pass.value.length > 30){
            errorPass.innerHTML = "La extensión de la contraseña no debe superar los 30 caracteres.";
            pass.style.border = "2px solid #ffa81c";
            errores = true;
        }else if (pass.value.trim()== ""){
            errorPass.innerHTML = "La contraseña no puede tener espacios vacíos.";
            pass.style.border = "2px solid #ffa81c";
            errores = true;
      
        }else  {
            errorPass.innerHTML = "";
            pass.style.border = "2px solid #20db93";
            
        };
            
        
      //si todo esta bien, le doy la bienvenida
              if(!errores){
                  alert("¡Tu Registro fue un éxito!")
              };
     

     })

    });
    
  