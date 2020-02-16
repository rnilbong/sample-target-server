# sample-target-server

This api server is lophorina's target endpoint.

## endpoint

### GET /v1/sample

* response

```json
[
  "1",
  "2",
  "3"
]
```

### GET /v1/sample/param

* request

`/v1/sample/param?id=test&pw=1234`

* response

```text
test/1234
```

### POST /v1/sample

* request body

```json
[
  "1",
  "2",
  "3"
]
```

* response

`200 OK`

### POST /v1/sample/member

* request body

```json
{
    "id": "test",
    "pw": "1234",
    "age": 20
}
```

* response

`200 OK`

### GET /v1/sample/{name}

* request

`/v1/sample/page/hihi`

* response

```html
<!DOCTYPE HTML>
<html>
<head>
    <title>HI</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<p >Hello, hihi!</p>
</body>
</html>
```
