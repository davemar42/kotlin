class Main {
    companion object{
        @JvmStatic fun main(vararg  args:String){
            var opcion:Int=0
            var suma:Int
            print("introduzca opcion")
            opcion= readLine()?.toInt()!!
            print("introduzca numero1 ")
            var numero1= readLine()?.toInt()
            print("introduzca numero2")
            var numero2= readLine()?.toInt()
            while(opcion!=0){

                    if(numero1!! >=1){
                        suma=numero1+ numero2!!
                        print(suma)
                        print("opcion")
                        opcion= readLine()?.toInt()!!

                    }
                    if(numero1==1||numero2==1){
                        print("numero no permitido")
                        break
                    }
            }

        }
    }
}