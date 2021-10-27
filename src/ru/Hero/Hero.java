package ru.Hero;

// абстрактность не требует реализации, она может переложить это на дочерние элементы
public abstract class Hero implements DamageTaker {
    private int hp;
    private DeathNotifier deathNotifier;

    public Hero(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public abstract String getPhrase();

    public void applyDamage(int damage) {
        if(damage < 0) {
            damage = 0;
        }
        var wasAlive = isAlive();
        hp -= damage;
        if (wasAlive && !isAlive()) {
            if (deathNotifier != null) {
                deathNotifier.newDeath(this);
            }

        }

    }

    public void setDeathNotifier(DeathNotifier deathNotifier) {
        this.deathNotifier = deathNotifier;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public void takeDamage(int damage) {
        applyDamage(damage);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "phrase=" + getPhrase() +
                " hp=" + hp +
                " alive? " + (isAlive() ? "Yes" : "No" ) +
                '}';
    }


}
