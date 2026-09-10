@Entity(nome="tb_clientes")
@Getters
@NoArgsConstructor
class Cliente{
    @id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private long id;
    @Colunn(nullable = false)
    private String nome;
    @Colunn(nullable = false, unique = true)
    private String email;
    @Colunn(nullable = false)
    private String senha;
    @Colunn(nullable = false, unique = true)
    private String cpf;
}