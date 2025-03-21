@param gg.jte.Content content

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${page == null ? "Página Inícial" : page.title()}</title>
</head>
<body>
    <main>${content}</main>
</body>
</html>