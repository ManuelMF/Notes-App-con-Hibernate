# notes

## PostgreSQL

If ident authentication error is shown:

1. Set md5 auth (instead of ident) in pg_hba.conf:
    ```
    sudo nano /var/lib/pgsql/data/pg_hba.conf
    ```
2. Restart postgresql service:
    ```
    sudo systemctl restart postgresql.service
    ```
