## 🧠 Visão Geral

O projeto foi desenvolvido utilizando conceitos de arquitetura em camadas e padrões de projeto (Design Patterns) para garantir:

- organização do código;
- facilidade de manutenção;
- reutilização;
- baixo acoplamento;
- facilidade de expansão futura.

---

# Arquitetura Utilizada

O sistema segue a arquitetura em camadas do Spring Boot:

```
Controller → Service → Repository → Banco de Dados
```

Cada camada possui uma responsabilidade específica:

| Camada | Responsabilidade |
| --- | --- |
| Controller | Receber requisições HTTP |
| Service | Regras de negócio |
| Repository | Comunicação com o banco |
| Model | Representação dos dados |

---

## ✅ Benefícios do MVC

- Separação de responsabilidades;
- Código mais organizado;
- Melhor manutenção;
- Facilidade de testes.

---

# 🔄 Fluxo de Funcionamento do Sistema

```
Cliente
   ↓
Controller
   ↓
Service
   ↓
Factory
   ↓
Strategy
   ↓
Repository
   ↓
Banco de Dados
```

---

# 🚀 Conclusão

A utilização dos padrões de projeto tornou o sistema mais modular, reutilizável e escalável.

Os padrões aplicados seguem boas práticas da engenharia de software e facilitam futuras expansões, como:

- novos tipos de frete;
- novos métodos de pagamento;
- integração com APIs externas;
- autenticação de usuários;
- microsserviços.

Além disso, o projeto demonstra aplicação prática de conceitos importantes utilizados no mercado de desenvolvimento Java com Spring Boot.