class Wizard implements Character {
  private AttackStrategy attackStrategy = new CastSpell();
  private DefenseStrategy defenseStrategy = new CreateMagicBarrier();

  @Override
  public void attack() {
    attackStrategy.attack();
  }

  @Override
  public void defend() {
    defenseStrategy.defend();
  }
}
