import java.util.List;
import java.util.Collections;

public abstract class Organizar {
    public void ordenar(List<MP3> playlist){
        for(int j = 0; j < playlist.size()-1; j++){
            int min = j;
            for (int i = j+1; i<playlist.size(); i++){
                if (this.ordenar(playlist.get(i), playlist.get(min))<0){
                    min = i;
                }
            }
            if (j != min){
                Collections.swap(playlist, j, min);
            }
        }
    }
    public abstract int ordenar(MP3 m1, MP3 m2);
}
