window.addEventListener('load', function(){
              
    //detectar cuando toco el boton de contacto (se envía el formulario)
     var botonContacto = document.getElementById("submit");
     botonContacto.addEventListener('click',function(){
      
      //tomar los datos del formulario
        var nombre =document.getElementById("nombre");
        var email = document.getElementById("email");
        var mensaje= document.getElementById("message");
        var errores = false;
        var expresion = /\w+@\w+\.+[a-z]/;
  

       //los span de errores del formulario 
        var errorNombre = document.querySelector("span.errorNombre");
        var errorEmail = document.querySelector("span.errorEmail");
        var errorMensaje = document.querySelector("span.errorMensaje")
        
   
      //por cada dato voy a validar
      //campo nombre
        if(nombre.value == ""){
            errorNombre.innerHTML = "El nombre es obligatorio.";
            nombre.style.border = "2px solid #ffa81c";
            errores = true;
        }else if (nombre.value.trim()== ""){
            errorNombre.innerHTML = "El nombre no puede tener espacios vacíos.";
            nombre.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(nombre.value.length < 3){
            errorNombre.innerHTML = "El nombre debe contener al menos 3 caracteres.";
            nombre.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(nombre.value.length > 40){
            errorNombre.innerHTML = "La extensión del nombre no debe superar los 40 caracteres.";
            nombre.style.border = "2px solid #ffa81c";
            errores = true;
        }else{
            errorNombre.innerHTML = "";
            nombre.style.border = "2px solid #20db93";
          }
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

          //campo mensaje
        if(mensaje.value == ""){
            errorMensaje.innerHTML = "El mensaje es obligatorio.";
            mensaje.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(mensaje.value.length < 3){
            errorMensaje.innerHTML = "El mensaje debe contener al menos 10 caracteres.";
            mensaje.style.border = "2px solid #ffa81c";
            errores = true;
        }else{
            errorMensaje.innerHTML = "";
            mensaje.style.border = "2px solid #20db93";
          }

     
        
         
         


            
            
            

      //si todo esta bien, le doy la bienvenida
              if(!errores){
                  alert("¡Gracias por ponerte en contacto!")
              };
     

     })

    });
 
