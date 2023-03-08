package ej4;

public class OrdenCi implements ICategoria{
    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        int[] carnets = new int[estudiantes.length];
        for (int i = 0; i < estudiantes.length; i++){
            carnets[i] = estudiantes[i].getCi();
        }
        int n = estudiantes.length;
        int temp;
        Estudiante tempe;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(carnets[j-1] > carnets[j]){
                    temp = carnets[j-1];
                    carnets[j-1] = carnets[j];
                    carnets[j] = temp;

                    tempe = estudiantes[j-1];
                    estudiantes[j-1] = estudiantes[j];
                    estudiantes[j] = tempe;
                }
            }
        }
        for (int i = 0; i < n; ++i){
            System.out.print(carnets[i] + " ");
        }
        System.out.println();
        return estudiantes;
    }
}
