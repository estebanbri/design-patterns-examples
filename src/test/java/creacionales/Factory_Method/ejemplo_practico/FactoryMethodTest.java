package creacionales.Factory_Method.ejemplo_practico;

import creacionales.Factory_Method.ejemplo_practico.patron.factory.IEnemyFactory;
import creacionales.Factory_Method.ejemplo_practico.patron.factory.impl.EnemyAFactory;
import creacionales.Factory_Method.ejemplo_practico.patron.factory.impl.EnemyBFactory;
import creacionales.Factory_Method.ejemplo_practico.patron.factory.impl.RandomEnemyFactory;
import creacionales.Factory_Method.ejemplo_practico.patron.product.IEnemy;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMethodTest {

    @Test
    public void testCreateEnemyA(){
        IEnemyFactory enemyFactory = new EnemyAFactory();
        IEnemy enemy = enemyFactory.createEnemy();
        assertEquals("Sword",enemy.getWeapon());
    }

    @Test
    public void testCreateEnemyB(){
        IEnemyFactory enemyFactory = new EnemyBFactory();
        IEnemy enemy = enemyFactory.createEnemy();
        assertEquals("Gun",enemy.getWeapon());
    }

    @Test
    public void testCreateRandomEnemy(){
        IEnemyFactory enemyFactory = new RandomEnemyFactory();
        IEnemy enemy = enemyFactory.createEnemy();
        assertNotNull(enemy.getWeapon());
    }


}