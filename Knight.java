class Knight implements Character {
  private AttackStrategy attackStrategy = new SwingSword();
  private DefenseStrategy[] defenseStrategies = {new Shield(), new Dodge(), new CreateMagicBarrier()};

  public void setAttackStrategy(AttackStrategy attackStrategy) {
    this.attackStrategy = attackStrategy;
  }

  @Override
  public void attack() {
    attackStrategy.attack();
  }

  @Override
  public void defend() {
    for (DefenseStrategy defense : defenseStrategies) {
      defense.defend();
    }
  }
}
