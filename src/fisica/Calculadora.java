package fisica;

public class Calculadora {
    public float fpgravidade;
    public float fpmassa;
    public float craio;
    public float cvelocidade;
    public float cmassa;
    public float iforca;
    public float isegundo;
    public float metro;
    public float distancia;
    public float tempo;
    public float disparo;
    public float maceleracao;
    public float mtempo;
    public float mveloinicial;
    
    public float Cfpeso () {
        float fpeso = fpgravidade*fpmassa;
        return fpeso;

    }
    public float Cfcentripeta () {
        float fcentripeta = ((cvelocidade*cvelocidade)/craio)*cmassa;
        return  fcentripeta;
    }

    public float Cimpulso () {
    float impulso = iforca*isegundo;
    return impulso;
    }

    public float Cfelastica () {
    float felastica = 200*metro;
        return felastica;
    }

    public float Cvmedia () {
    	float vmedia = distancia/tempo ;
        return vmedia;
    }

    public float Cmru () {
    	float mru = disparo * 340/2;
        return mru;

    }

    public float  Cmruv () {
		float mruv = ((maceleracao*mtempo)+mveloinicial);
		return mruv;
		
	}

}