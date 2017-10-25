namespace WindowsFormsApp1
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtCentigrados = new System.Windows.Forms.TextBox();
            this.txtFarenheit = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(32, 55);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(63, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Centigrados";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(32, 145);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(60, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = " Fahrenheit";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // txtCentigrados
            // 
            this.txtCentigrados.Location = new System.Drawing.Point(230, 55);
            this.txtCentigrados.Name = "txtCentigrados";
            this.txtCentigrados.Size = new System.Drawing.Size(100, 20);
            this.txtCentigrados.TabIndex = 2;
            this.txtCentigrados.TextChanged += new System.EventHandler(this.txtCentigrados_TextChanged);
            this.txtCentigrados.Enter += new System.EventHandler(this.txtCentigrados_Enter);
            this.txtCentigrados.MouseEnter += new System.EventHandler(this.txtCentigrados_MouseEnter);
            // 
            // txtFarenheit
            // 
            this.txtFarenheit.Location = new System.Drawing.Point(230, 128);
            this.txtFarenheit.Name = "txtFarenheit";
            this.txtFarenheit.Size = new System.Drawing.Size(100, 20);
            this.txtFarenheit.TabIndex = 3;
            this.txtFarenheit.TextChanged += new System.EventHandler(this.txtFarenheit_TextChanged);
            this.txtFarenheit.Enter += new System.EventHandler(this.txtFarenheit_Enter);
            this.txtFarenheit.MouseEnter += new System.EventHandler(this.txtFarenheit_MouseEnter);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(475, 284);
            this.Controls.Add(this.txtFarenheit);
            this.Controls.Add(this.txtCentigrados);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtCentigrados;
        private System.Windows.Forms.TextBox txtFarenheit;
    }
}

