public class Relogio {
    public long retornaAnguloRelogio(long hora, long min) {
        long h_angulo = (long) ((hora * 60 + min) * 0.5);
        long m_angulo = (min * 6) - h_angulo;

        if (m_angulo < 0){
            m_angulo = -m_angulo;
        }
        return m_angulo;
    }
}