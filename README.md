# WarehouseZeroToHero
Warehouse do projeto clone de backend Java

# Warehouse-ms

## Endpoints

- BaseURL: /warehouses
- POST: create()
- GET: getAll()
- GET: /{id}: getById()
- DELETE /{id}: delete()

## Model
```json
  {
    "id": 1,
    "productId": 1,
    "quantity": 10
  }
```

## Business Rules

- O estoque é responsável por avisar se o produto está ou não disponível. Caso a quantidade do produto seja 0 deve informar o outro serviço.
- Não é permitido mais de uma linha do mesmo produto salvo na base de dados.
