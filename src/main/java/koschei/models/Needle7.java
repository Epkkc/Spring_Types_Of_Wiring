package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {

    @Autowired
    private Deth8 death;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death.toString();
    }
}
