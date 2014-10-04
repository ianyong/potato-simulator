import Vec2;
import World;

public class DefaultWorldCreator implements WorldCreator {
  @Override
  public World createWorld(Vec2 gravity) {
    return new World(gravity);
  }
}
