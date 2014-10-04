import Vec2;
import World;

public interface WorldCreator {
  World createWorld(Vec2 gravity);
}
