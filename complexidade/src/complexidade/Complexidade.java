//=============================================================================================
//		Complexidade no pior caso O(n^2)
//=============================================================================================
public void A(int a[]) {
        int aux;
        for (int j = 0; j < a.length; j++) {
            for (i = 0; i < a.length - 1; i++) {	//Complexidade O(n^2)
                if (a[i] > a[i + 1]) {
                    aux = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = aux;
                }
            }
        }
    }
//=============================================================================================
//		Complexidade no pior caso O(n^2)
//=============================================================================================
    public void B(int a[]) {
        for (j = 2; j < a.length; j++) {
            int key = a[j];
            int i = j−1; 
            while (i > 0 && a[i] > key) {		//Complexidade O(n^2)
                a[i + 1] = a[i];
                i = i−1; 
            }
            a[i + 1] = key;
        }
    }
//=============================================================================================
//		Complexidade no pior caso O(n)
//=============================================================================================
    public void C(int n, int v[]) {
        int j, x = v[0];
        for (j = 1; j < n; j += 1) {		//Complexidade O(n)
            if (x < v[j]) {
                x = v[j];
            }
        }
    }
//=============================================================================================
//		Complexidade no pior caso O(n^2)
//=============================================================================================
    public void D(int[] v) {
        int m;
        int tmp;
        for (int i = 0; i < v.length; i++) {
            m = i;
            for (int j = i + 1; j < v.length; j++) {	//Complexidade O(n^2)
                if (v[j] < v[m]) {
                    m = j;
                }
            }
            if (m != i) {
                tmp = v[m];
                v[m] = v[i];
                v[i] = tmp;
            }
        }
    }
}
//=============================================================================================
//		Treco de código do trabalho de programação orientada a objetos
//		Complexidade no pior caso O(n)
//=============================================================================================
    public void act(float delta) {
        super.act(delta);
        if (Gdx.input.isKeyPressed(Keys.SPACE)) {   //classe de lancamento do missel com acriacao do objeto execucao do asstes e a condicao para tempo o proximo disparo
            if (TimeUtils.millis() - lastFire >= 300) {
                Assets.missile.play();
                Missile missile = new Missile(Assets.n_missile, getX() + getWidth() / 2 - 5, getY() + getHeight(), 300,gamescreen);
                getStage().addActor(missile);
                lastFire = TimeUtils.millis();
            }

        }

        x = getX();     // condicao para movimentacao da nave
        if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
            x += delta * vel;
        }
        if (Gdx.input.isKeyPressed(Keys.LEFT)) {		
            x -= delta * vel;
        }

        if (x <= 0) {
            x = 0;
        } else if (x >= Assets.LARGURA - getWidth()) {		//Complexidade O(n)
            x = Assets.LARGURA - getWidth();
        }

        setPosition(x, 0);
    }	
//=============================================================================================